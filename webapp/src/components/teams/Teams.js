import React, {Component} from 'react';
import classes from './Teams.css'
import {Button, FormControl, InputLabel} from "@material-ui/core";
import {default as Select} from "react-select";
import ReactJson from "react-json-view";

const options = [{value: '2017', label: '2017'}, {value: '2018', label: '2018'}, {value: '2019', label: '2019'}, {value: '2020', label: '2020'}, {
  value: '2021',
  label: '2021'
}, {value: '2022', label: '2022'}];

class Teams extends Component {
  constructor(props) {
    super(props);
    this.state = {annees: '', resultApi: ''};
  }

  handleChangeAnnees = (event) => {
    console.log('annees : ', event.value);
    this.setState({annees: event.value});
  }

  onFormSubmit = () => {
    console.log('onSubmit, state => ', this.state);
    fetch(`http://localhost:8080/api/team/${this.state.annees}`)
      .then(response => response.json())
      .then(response => {
        console.log(response);
        this.setState({
          resultApi: JSON.stringify(response)
        })
      });
  }

  render = () => {
    return (
      <div>
        <h2>Teams</h2>
        <div className={`${classes.form} form`}>
          <FormControl>
            <InputLabel>Années</InputLabel>
            <Select value={this.state.annees.label} onChange={this.handleChangeAnnees}
                    options={options} className={`${classes.width} width`}/>
          </FormControl>
          <Button onClick={this.onFormSubmit} variant="contained" color="primary">Submit</Button>
        </div>


        {this.state.resultApi ? <ReactJson src={JSON.parse(this.state.resultApi)}/> : null}

      </div>);
  }
}

export default Teams;