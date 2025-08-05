import React, { useState } from 'react';
import './App.css';

function App() {
    // State for counter
    const [counter, setCounter] = useState(0);
    const [amount, setAmount] = useState('');
    const [convertedAmount, setConvertedAmount] = useState(null);

    // Increment function
    const incrementCounter = () => {
        setCounter(counter + 1);
        sayHello();
    };

    // Decrement function
    const decrementCounter = () => {
        setCounter(counter - 1);
    };

    // Function to say hello
    const sayHello = () => {
        alert("Hello Member");
    };

    // Function to say welcome
    const sayWelcome = (message) => {
        alert(message);
    };

    // Handle currency conversion
    const handleCurrencyConvert = () => {
        const euroRate = 0.011; // Example conversion rate
        const converted = amount * euroRate;
        setConvertedAmount(converted);
    };

    // Handle form submission
    const handleSubmit = (e) => {
        e.preventDefault();
        handleCurrencyConvert();
    };
    const [text, setText] = useState("");
    return (
        <div className="App">
            <header></header>
            <h1>Event Examples App</h1>

            <div>
                <h2>Counter: {counter}</h2>
                <button onClick={incrementCounter}>Increment</button>
                <button onClick={decrementCounter}>Decrement</button>
            </div>

            <div>
                <button onClick={() => sayWelcome("Welcome!")}>Say Welcome</button>
            </div>

            <div>
                <button onClick={() => setText("I was clicked")}>OnPress</button>
                <p>{text}</p>
            </div>

            <div>
                <h2>Currency Converter</h2>
                <form onSubmit={handleSubmit}>
                    <input
                        type="number"
                        value={amount}
                        onChange={(e) => setAmount(e.target.value)}
                        placeholder="Enter amount in INR"
                    />
                    <button type="submit">Convert to Euro</button>
                </form>
                {convertedAmount !== null && (
                    <p>Converted Amount: €{convertedAmount.toFixed(2)}</p>
                )}
            </div>
        </div>
    );
}

export default App;
