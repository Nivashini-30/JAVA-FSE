import React from 'react';
import './App.css';

// 1. Data Source Export configurations exactly matching hint parameters[cite: 6]
export const books = [
  { id: 101, bname: 'Master React', price: 670 },
  { id: 102, bname: 'Deep Dive into Angular 11 ', price: 800 },
  { id: 103, bname: 'Mongo Essentials', price: 450 }
];

const courses = [
  { id: 1, cname: 'Angular', date: '4/5/2021' },
  { id: 2, cname: 'React', date: '6/3/20201' } // Kept exactly as shown in screenshot string format
];

const blogs = [
  { id: 201, title: 'React Learning', author: 'Stephen Biz', snippet: 'Welcome to learning React!' },
  { id: 202, title: 'Installation', author: 'Schewzdenier', snippet: 'You can install React from npm.' }
];

function App() {
  
  // 2. Element Variable Rendering matching the specific hint parameters[cite: 6]
  const bookdet = (
    <ul>
      {books.map((book) => (
        <div key={book.id}>
          <h3>{book.bname}</h3>
          <h4>{book.price}</h4>
        </div>
      ))}
    </ul>
  );

  // 3. Conditional implementation for Course segments via inline extraction loops[cite: 6]
  const coursedet = (
    <div>
      {courses.length > 0 ? (
        courses.map((course) => (
          <div key={course.id}>
            <h3>{course.cname}</h3>
            <h4>{course.date}</h4>
          </div>
        ))
      ) : (
        <p>No courses available at this moment.</p>
      )}
    </div>
  );

  // 4. Logical short-circuit conditional formatting for Blog contents[cite: 6]
  const content = (
    <div>
      {blogs && blogs.map((blog) => (
        <div key={blog.id}>
          <h3>{blog.title}</h3>
          <p><strong>{blog.author}</strong></p>
          <p>{blog.snippet}</p>
        </div>
      ))}
    </div>
  );

  // 5. structural execution match reflecting the hint frame framework[cite: 6]
  return (
    <div className="container-layout">
      {/* Course Column Section View */}
      <div className="mystyle1">
        <h1>Course Details</h1>
        {coursedet}
      </div>

      {/* Book Column Section View */}
      <div className="st2">
        <h1>Book Details</h1>
        {bookdet}
      </div>

      {/* Blog Column Section View */}
      <div className="v1">
        <h1>Blog Details</h1>
        {content}
      </div>
    </div>
  );
}

export default App;