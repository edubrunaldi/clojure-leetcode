# Clojure LeetCode

This repository contains solutions to various [LeetCode](https://leetcode.com/) problems implemented in **Clojure**. The goal is to tackle algorithm challenges using Clojure, showcasing functional, concise, and idiomatic approaches.

I'm using this [problem list](https://leetcode.com/problem-list/prshgx6i/) to practice Clojure.

## Repository Structure

Each LeetCode challenge has its own implementation in a dedicated namespace.

## Getting Started

### Prerequisites
- [Leiningen](https://leiningen.org/) or [Clojure CLI](https://clojure.org/guides/getting_started)

### Steps to Clone and Run

1. Clone the repository:
   ```bash
   git clone https://github.com/edubrunaldi/clojure-leetcode.git
   cd clojure-leetcode
   ```

## Contributing

We welcome contributions! If you'd like to add your own solution to a LeetCode problem, please follow these guidelines:

1.  **Create a new file** within the appropriate problem directory. If the problem directory doesn't exist yet, create it under `src/clojure_leetcode/`.

2.  **Name your file** according to the following convention: `by_<username>_[optional_data].clj`.

   * `<username>`: Your GitHub username.
   * `[optional_data]`: You can add optional data like the year or a specific approach you used (e.g., `2025`, `20250315`, etc..).

3.  **Structure your solution** within the file. Ensure it's a valid Clojure namespace and contains your implementation of the LeetCode problem.

**Example:**

Let's say you want to contribute your solution to the "Add Digits" problem. You would create a new file like this:

`src/clojure_leetcode/add_digits/by_yourusername.clj`

**For Learners:** If you are using this repository to learn Clojure through LeetCode problems, we encourage you to add a date to your filename (e.g., by_yourusername_20250315.clj). Setting a reminder to revisit these problems in a year or two can be a great way to see how your Clojure skills and problem-solving approaches have developed!
