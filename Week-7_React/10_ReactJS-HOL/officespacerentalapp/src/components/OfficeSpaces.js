import React from 'react';
function OfficeSpaces() {
    // Main office space object
    const office = {
        name: "Premium Office Suite",
        rent: 55000,
        address: "123 Business Ave, Financial District",
        image: "https://via.placeholder.com/600x400?text=Office+Space" 
    };
    // List of office spaces
    const officeSpaces = [
        { name: "Executive Suite", rent: 65000, address: "456 Corporate Blvd" },
        { name: "Startup Loft", rent: 45000, address: "789 Innovation St" },
        { name: "Coworking Space", rent: 70000, address: "101 Tech Park" },
    ];
    return (
        <div className="component">
            <img alt="Modern office space interior" className="header-image"  src="https://storage.googleapis.com/workspace-0f70711f-8b4e-4d94-86f1-2a93ccde5887/image/9132f01a-b007-442a-8de1-a29cb35b480b.png" height={300} width={300}/>
            <h1>Office Space Rental App</h1>
            <h2>Featured Space</h2>
            <div className="office-details">
                <p><strong>Name:</strong> {office.name}</p>
                <p><strong>Rent:</strong> <span style={{ color: office.rent < 60000 ? 'red' : 'green' }}>${office.rent}</span></p>
                <p><strong>Address:</strong> {office.address}</p>
            </div>
            <h2>Available Spaces</h2>
            <ul className="office-list">
                {officeSpaces.map((space, index) => (
                    <li key={index}>
                        <strong>{space.name}</strong> - 
                        <span style={{ color: space.rent < 60000 ? 'red' : 'green' }}>
                            ${space.rent}
                        </span>
                        <br/>{space.address}
                    </li>
                ))}

             </ul>
        </div>
    );
}
export default OfficeSpaces;