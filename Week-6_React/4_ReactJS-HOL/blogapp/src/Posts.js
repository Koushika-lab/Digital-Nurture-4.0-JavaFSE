import React from 'react';
import Post from './Post';

class Posts extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            posts: []
        };
    }

    loadPosts() {
        fetch('https://jsonplaceholder.typicode.com/posts')
            .then(response => response.json())
            .then(data => {
                const posts = data.map(
                    item => new Post(item.id, item.title, item.body)
                );
                this.setState({ posts: posts });
            })
            .catch(error => {
                console.error('Error fetching posts:', error);
                alert('Error fetching posts: ' + error);
            });
    }

    componentDidMount() {
        this.loadPosts();
    }

    render() {
        return (
            <div style={{ padding: "20px" }}>
                <h2>Blog Posts</h2>
                {this.state.posts.map(post => (
                    <div key={post.id} style={{
                        border: "1px solid #ccc",
                        padding: "10px",
                        margin: "10px",
                        borderRadius: "5px"
                    }}>
                        <h3>{post.title}</h3>
                        <p>{post.body}</p>
                    </div>
                ))}
            </div>
        );
    }

    componentDidCatch(error, info) {
        alert("An error occurred in the component: " + error);
    }
}

export default Posts;
