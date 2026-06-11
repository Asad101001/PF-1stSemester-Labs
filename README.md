# Java Fundamentals (CS-351)

Welcome to the **Java Fundamentals** project repository. This project contains a collection of fundamental Java programming exercises, covering core concepts such as file handling, string manipulation, sorting algorithms, array operations, and more. It is structured to help students understand and master the foundational concepts taught in CS-351.

## 📂 Project Structure

The codebase has been refactored and organized into clean, modular directories to separate concerns and make navigation easier. All class files strictly follow the Java standard `PascalCase` naming convention. 

* **`arrays/`**: Contains array manipulation programs including single and multi-dimensional (jagged) arrays, calculations of averages and sums, and student sorting.
* **`assignments_and_exams/`**: Contains larger assignments, quiz samples, and initial lecture codes.
* **`data/`**: Stores all the input/output `.txt` files required by the file-handling programs (`business_1.txt`, `filename.txt`, `firsttxt.txt`, etc.).
* **`file_handling/`**: Contains multiple scripts demonstrating how to safely read from, write to, and handle standard file `.txt` files using Java's I/O libraries.
* **`math_and_logic/`**: Contains programs dealing with math logic, base conversions, calculating days elapsed, matrix multiplication, and complex pattern printing.
* **`recursion/`**: Contains advanced logic like finding factorials and reversing strings strictly using recursive functions.
* **`searching/`**: Implementations of common search algorithms like Linear Search and Binary Search.
* **`sorting/`**: Implementations of various array sorting algorithms, including Bubble Sort and Selection Sort.
* **`strings/`**: Programs exploring string manipulation, case-sensitive/insensitive ASCII conversions, and string comparison.
* **`src/`**: The main entry point of the project, housing `Main.java`.

## 🚀 Running the Project

The project is already pre-configured as an Eclipse / Visual Studio Code Java project (`.classpath`) and an IntelliJ IDEA project (`.idea/java1.iml`). 
The new directories are seamlessly integrated as root **source folders**.

1. **Clone or Open the Repository** in your favorite IDE (Eclipse, VS Code, or IntelliJ).
2. The IDE will automatically recognize `arrays`, `sorting`, `math_and_logic`, etc., as source folders.
3. Open any `.java` file with a `main` method.
4. Click **Run** in your IDE.

*Note: All file paths in the scripts are hardcoded to correctly fetch from the root `data/` directory.*

## 🛠️ Highlights & Best Practices
- **Standardized Naming Convention:** All files and classes conform strictly to `PascalCase`.
- **Zero Build Errors:** Unmappable encoding characters have been fixed, meaning all programs compile with 0 errors.
- **Isolated Data:** Clean separation of executable code and text data inputs.
