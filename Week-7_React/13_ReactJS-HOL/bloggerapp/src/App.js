import React, { useState } from 'react';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';
import './App.css';

function App() {
  const [showBooks, setShowBooks] = useState(true);
  const [showBlogs, setShowBlogs] = useState(true);
  const [showCourses, setShowCourses] = useState(true);

  return (
    <div>
      <h1 style={{ textAlign: 'center' }}>Blogger App - Row View</h1>

      <div className="container">
        {showBooks && (
          <div className="section st2">
            <h2>Book Details</h2>
            <BookDetails />
          </div>
        )}

        <div className="section v1">
          <h2>Blog Details</h2>
          {showBlogs ? <BlogDetails /> : <p>No blog data available</p>}
        </div>

        <div className="section mystyle1">
          <h2>Course Details</h2>
          {showCourses ? <CourseDetails /> : <p>Course data will be available soon.</p>}
        </div>
      </div>
    </div>
  );
}

export default App;
