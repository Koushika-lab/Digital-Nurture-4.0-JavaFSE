import React from 'react';
import { courses } from '../data';

function CourseDetails() {
  return (
    <>
      {courses.length > 0 ? (
        <ul>
          {courses.map((course) => (
            <li key={course.id}>
              {course.cname} - {course.duration}
            </li>
          ))}
        </ul>
      ) : (
        <p>No courses to show.</p>
      )}
    </>
  );
}

export default CourseDetails;
