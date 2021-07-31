import React, {Component} from 'react';
import {BrowserRouter as Router, Link, Route, Switch} from 'react-router-dom';
import {AppBar, Button, Toolbar} from "@material-ui/core";
import Accueil from "./components/accueil/Accueil";
import Teams from "./components/teams/Teams";
import Player from "./components/player/Player";

class App extends Component {
  render() {
    const ACCUEIL = 'Accueil', TEAMS = 'Teams', PLAYER = 'Player';

    return (
      <Router>
        <div>
          <h1 style={{textAlign: 'center'}}>Hockey Game</h1>
          <nav>
            <AppBar position="static">
              <Toolbar>
                <Button color="inherit"><Link to={'/'} style={{textDecoration: 'none', color: 'white'}}>{ACCUEIL}</Link></Button>
                <Button color="inherit"><Link to={'/teams'} style={{textDecoration: 'none', color: 'white'}}>{TEAMS}</Link></Button>
                <Button color="inherit"><Link to={'/player'} style={{textDecoration: 'none', color: 'white'}}>{PLAYER}</Link></Button>
              </Toolbar>
            </AppBar>
          </nav>
          <hr/>
          <Switch>
            <Route exact path='/' component={Accueil}/>
            <Route path='/teams' component={Teams}/>
            <Route path='/player' component={Player}/>
          </Switch>
        </div>
      </Router>);
  }
}

export default App;