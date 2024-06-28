 import React from 'react';
import { useState, useEffect } from 'react';

 function App(){

   const [name,setName] = useState("");

   useEffect(() => {
      fetch('http://localhost:8080/hello')
          .then(response => {
              if (!response.ok) {
                  throw new Error('Network response was not ok');
              }
            //   console.log(response.text());
              return response.text();
          })
          .then(data => setName(data))
          .catch(error => console.error('Error fetching data:', error));
  }, []);


    return <>
    Hello <strong>{name}</strong>
    </>
 }

 export default App;