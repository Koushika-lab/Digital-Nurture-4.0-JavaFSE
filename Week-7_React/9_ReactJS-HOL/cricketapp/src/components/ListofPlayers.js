import React from 'react';
function ListofPlayers() {
    const players = [
        { name: 'Virat Kohli', score: 118 },
        { name: 'Rohit Sharma', score: 92 },
        { name: 'KL Rahul', score: 72 },
        { name: 'Shubman Gill', score: 45 }, 
        { name: 'Shreyas Iyer', score: 58 },
        { name: 'Rishabh Pant', score: 93 },
        { name: 'Hardik Pandya', score: 65 },
        { name: 'Ravindra Jadeja', score: 42 },
        { name: 'Jasprit Bumrah', score: 18 },
        { name: 'Mohammed Siraj', score: 25 },
    ]
    // Filter players with scores below 70 using arrow function
    const playersBelow70 = players
        .filter((player) => player.score < 70)
        .sort((a, b) => a.score - b.score);
    return (
        <div className="component">
            <h1>List of Players</h1>
            <h2>All Players</h2>
            <table>
                <thead>
                    <tr>
                        <th>Player Name</th>
                        <th>Score</th>
                    </tr>
                </thead>
                <tbody>
                    {players.map((player, index) => (
                                <tr key={index}>
                                    <td>{player.name}</td>
                                    <td>{player.score}</td>
                                </tr>
                            ))}
                </tbody>
            </table>
            <h2>Players with Scores Below 70</h2>
            <table>
                <thead>
                    <tr>
                        <th>Player Name</th>
                        <th>Score</th>
                    </tr>
                </thead>
                <tbody>
                    {playersBelow70.map((player, index) => (
                        <tr key={index}>
                            <td>{player.name}</td>
                            <td>{player.score}</td>
                        </tr>
                    ))}
                </tbody>
            </table>
        </div>
    );
}
export default ListofPlayers;

