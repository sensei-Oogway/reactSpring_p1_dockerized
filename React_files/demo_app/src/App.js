import React from "react";
import { useState, useEffect } from "react";

function App() {
  const [name, setName] = useState("");

  useEffect(() => {
    fetch("/api/hello")
      .then((response) => {
        if (!response.ok) {
          throw new Error("Network response was not ok");
        }
        return response.text();
      })
      .then((data) => setName(data))
      .catch((error) => console.error("Error fetching data:", error));
  }, []);

  return (
    <>
      Hello <strong>{name}</strong>
    </>
  );
}

export default App;
