import React from 'react';
import { books } from '../data';

function BookDetails() {
  return (
    <ul>
      {books.map((book) => (
        <li key={book.id}>
          {book.bname} - ₹{book.price}
        </li>
      ))}
    </ul>
  );
}

export default BookDetails;
