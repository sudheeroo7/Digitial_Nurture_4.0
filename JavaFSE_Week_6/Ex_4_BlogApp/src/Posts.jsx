import React from "react";

class Posts extends React.Component {
  constructor(props) {
    super(props);
    // Step 5: Initialize state with empty posts list
    this.state = {
      posts: [],
      hasError: false
    };
  }

  // Step 6: Method to fetch posts from API
  loadPosts() {
    fetch("https://jsonplaceholder.typicode.com/posts")
      .then((response) => {
        if (!response.ok) throw new Error("Network response was not ok");
        return response.json();
      })
      .then((data) => {
        this.setState({ posts: data });
      })
      .catch((error) => {
        this.setState({ hasError: true });
        console.error("Error fetching posts:", error);
      });
  }

  // Step 7: Fetch data after component mounts
  componentDidMount() {
    this.loadPosts();
  }

  // Step 8: Render posts
  render() {
    return (
      <div>
        <h2>Posts</h2>
        {this.state.posts.map((post) => (
          <div key={post.id}>
            <h3>{post.title}</h3>
            <p>{post.body}</p>
            <hr />
          </div>
        ))}
      </div>
    );
  }

  // Step 9: Catch errors and show alert
  componentDidCatch(error, info) {
    alert("An error occurred: " + error.message);
    console.error("Error info:", info);
  }
}

export default Posts;