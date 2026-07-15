import React from 'react';
import Post from './Post';

class Posts extends React.Component {
  constructor(props) {
    super(props);
    // Initialize component state with an empty array of posts
    this.state = {
      postsList: [],
      hasError: false
    };
  }

  // Method to fetch data and assign to state
  loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then((response) => {
        if (!response.ok) {
          throw new Error('Failed to fetch posts from the API.');
        }
        return response.json();
      })
      .then((data) => {
        // Map the raw JSON data to instances of our Post class
        const mappedPosts = data.map(
          (item) => new Post(item.id, item.title, item.body)
        );
        this.setState({ postsList: mappedPosts });
      })
      .catch((error) => {
        alert('Error loading posts: ' + error.message);
      });
  }

  // Lifecycle Hook: Invoked immediately after component is mounted
  componentDidMount() {
    this.loadPosts();
  }

  // Lifecycle Hook: Error Boundary catch
  componentDidCatch(error, info) {
    this.setState({ hasError: true });
    alert(`An error occurred in the component: ${error.message}`);
    console.error('Error Details:', info);
  }

  render() {
    if (this.state.hasError) {
      return (
        <div style={{ textAlign: 'center', marginTop: '20px', color: 'red' }}>
          <h2>Something went wrong displaying the posts.</h2>
        </div>
      );
    }

    return (
      <div style={{ padding: '20px', maxWidth: '800px', margin: '0 auto' }}>
        <h1 style={{ color: '#2c3e50', borderBottom: '2px solid #eee', paddingBottom: '10px' }}>
          Latest Blog Posts
        </h1>
        {this.state.postsList.length === 0 ? (
          <p>Loading posts...</p>
        ) : (
          this.state.postsList.map((post) => (
            <div key={post.id} style={{ margin: '20px 0', borderBottom: '1px solid #eee', paddingBottom: '15px' }}>
              <h2 style={{ color: '#34495e', textTransform: 'capitalize' }}>
                {post.title}
              </h2>
              <p style={{ color: '#555', lineHeight: '1.6' }}>
                {post.body}
              </p>
            </div>
          ))
        )}
      </div>
    );
  }
}

export default Posts;