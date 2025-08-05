import React, { useState } from 'react';
import ListofPlayers from './components/ListofPlayers';
import IndianPlayers from './components/IndianPlayers';
function App() {
    const [showListOfPlayers, setShowListOfPlayers] = useState(true);
    return (
        <div className="container">
                    
            <div>
                <button 
                    onClick={() => setShowListOfPlayers(true)}
                    style={{background: showListOfPlayers ? '#2980b9' : '#3498db'}}
                >
                    Player Stats
                </button>
                <button
                    onClick={() => setShowListOfPlayers(false)}
                    style={{background: !showListOfPlayers ? '#2980b9' : '#3498db'}}
                >
                    Team Analysis
                  </button>
            </div>
            {showListOfPlayers ? <ListofPlayers /> : <IndianPlayers />}
        </div>
    );
}
export default App;