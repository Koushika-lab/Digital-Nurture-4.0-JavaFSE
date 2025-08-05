import React from 'react';
function IndianPlayers() {
    const indianPlayers = [
        'Virat Kohli',
        'Rohit Sharma',
        'KL Rahul',
        'Shikhar Dhawan',
        'Shreyas Iyer',
        'Rishabh Pant',
        'Hardik Pandya',
        'Ravindra Jadeja',
        'Jasprit Bumrah',
        'Mohammed Shami',
        'Yuzvendra Chahal'
    ];
    // Destructuring for odd and even team players
    const [player1, player2, player3, player4, player5, player6, player7, player8, player9, player10, player11] = indianPlayers;
    const oddTeamPlayers = [player1, player3, player5, player7, player9, player11];
    const evenTeamPlayers = [player2, player4, player6, player8, player10];
    // Two arrays to merge
    const T20players = ['Virat Kohli', 'Rohit Sharma', 'Rishabh Pant', 'Hardik Pandya'];
    const RanjiTrophyPlayers = ['Shreyas Iyer', 'Shikhar Dhawan', 'KL Rahul', 'Ravindra Jadeja'];
    // Merging arrays using ES6 spread operator
    const allPlayers = [
        ...T20players.map(player => `${player} (T20)`),
        ...RanjiTrophyPlayers.map(player => `${player} (Ranji)`)
    ];
    return (
        <div className="component">
            <h1>Indian Cricket Team</h1>
            
            <h2>Odd Team Players</h2>
            <div className="player-list">
                {oddTeamPlayers.map((player, index) => (
                    <div key={index} className="player-card">{player}</div>
                ))}
            </div>
            <h2>Even Team Players</h2>
            <div className="player-list">
                {evenTeamPlayers.map((player, index) => (
                    <div key={index} className="player-card">{player}</div>
                ))}
            </div>
            <h2>All Players - T20 & Ranji Trophy</h2>
            <div className="player-list">
                {allPlayers.map((player, index) => (
                    <div key={index} className="player-card">{player}</div>
                ))}
            </div>
        </div>
    );
}

export default IndianPlayers;