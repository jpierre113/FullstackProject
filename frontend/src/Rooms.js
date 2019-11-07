import React from 'react';

const Rooms = (props) => {

    return(
      <div className="Room">
        <ul>
        <li>Single Bed</li>
        <input type="submit" value="Select" className="selectRoom" />
        <li>Double Beds</li>
        <input type="submit" value="Select" className="selectRoom" />
        
        </ul>

      </div>

    );

}
  export default Rooms;
