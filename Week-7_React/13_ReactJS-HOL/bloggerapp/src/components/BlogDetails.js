import React from 'react';
import { blogs } from '../data';

function BlogDetails() {
  if (blogs.length === 0) return null;

  return (
    <ul>
      {blogs.map((blog) => (
        <li key={blog.id}>
          "{blog.title}" by {blog.author}
        </li>
      ))}
    </ul>
  );
}

export default BlogDetails;
