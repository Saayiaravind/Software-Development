# My Journey towards Software Development Mastery

Welcome to my repository where I document my journey towards becoming a better software developer.

## Data Structures and Algorithms

Educating myself with different forms of data storage, techniques that can be applied to the data structures and building efficient problem-solving skills.

### Progress Tracker

Progress: <div id="progressBar"></div>

<script>
    // Define the total number of topics and completed topics
    const totalTopics = 22; // Update this with the total number of topics
    let completedTopics = 14; // Update this with the number of completed topics

    // Calculate the completion percentage
    const completionPercentage = Math.floor((completedTopics / totalTopics) * 100);

    // Update the progress bar dynamically
    const progressBar = document.getElementById('progressBar');
    progressBar.style.width = `${completionPercentage}%`;
    progressBar.style.backgroundColor = 'green'; // Update color as desired
    progressBar.style.height = '20px'; // Update height as desired
    progressBar.innerText = `${completionPercentage}%`;
</script>

### Resources

I'm following the learning path prescribed by TakeUForward

- [TUF](https://takeuforward.org/strivers-a2z-dsa-course/strivers-a2z-dsa-course-sheet-2)

## Contributing

If you have any suggestions, corrections, or resources to share, feel free to contribute by opening an issue or pull request.
