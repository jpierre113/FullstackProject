import React, {Component} from 'react';
import DayPickerInput from 'react-day-picker/DayPickerInput';
import 'react-day-picker/lib/style.css';

const Reservation = (props) => {

    return(
      <div className="Reservation">
      <h1>Make a Reservation</h1>
      <DayPickerInput
      dayPickerProps={{
        month: new Date(2019, 10),
        showWeekNumbers: true,
        todayButton: 'Today',
      }}
    />
      </div>
    );

}
  export default Reservation;
