console.log("JS is running");

// Check which page we are on
const page = window.location.pathname;
console.log("Current path:", page);

// Flights Page Logic
if (page.toLowerCase().includes("flights.html")) {
  console.log("On Flights page.");

  const apiKey = "d71aa6-56b74a";
  const arrivalsUrl = `https://aviation-edge.com/v2/public/timetable?key=${apiKey}&iataCode=YXY&type=arrival`;
  const departuresUrl = `https://aviation-edge.com/v2/public/timetable?key=${apiKey}&iataCode=YXY&type=departure`;

  let combinedFlights = [];

  // Fetch Arrivals
  fetch(arrivalsUrl)
    .then((response) => response.json())
    .then((arrivals) => {
      // Tag arrivals
      arrivals.forEach((flight) => (flight.flightType = "arrival"));

      // Fetch Departures
      fetch(departuresUrl)
        .then((response) => response.json())
        .then((departures) => {
          // Tag departures
          departures.forEach((flight) => (flight.flightType = "departure"));

          // Combine
          combinedFlights = arrivals.concat(departures);

          console.log("Combined Flights:", combinedFlights);

          // Later: sort, display in table, filter, etc.
        })
        .catch((error) => console.error("Error fetching departures:", error));
    })
    .catch((error) => console.error("Error fetching arrivals:", error));
}

// Home Page Logic
else if (page.includes("index.html")) {
  console.log("On Home page.");
  // Any home page JavaScript can go here
}
