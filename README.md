# 📚 Library Management System

A comprehensive Java-based Library Management System that demonstrates Object-Oriented Programming principles, Collections Framework, and console-based user interaction.

## 🌟 Features

- **Book Management**: Add, view, and manage library catalog
- **Borrowing System**: Borrow and return books with due date tracking
- **Search Functionality**: Search books by title with partial matching
- **Availability Tracking**: Real-time book availability status
- **Due Date Management**: Automatic due date calculation (2 weeks from borrow date)
- **User-Friendly Interface**: Interactive console menu system

## 🛠️ Technologies Used

- **Java 8+**: Core programming language
- **Collections Framework**: HashMap for efficient book storage, HashSet for borrowed books tracking
- **Java Time API**: LocalDate for due date management
- **Object-Oriented Design**: Classes, encapsulation, and abstraction


## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code) or text editor
- Terminal/Command Prompt

### Installation & Setup

1. **Clone the repository:**
   ```bash
   git clone https://github.com/PixelDev-Vic/Library-Management-System.git
   ```

2. **Navigate to project directory:**
   ```bash
   cd library-management-system
   ```

3. **Compile the Java file:**
   ```bash
   javac LibrarySystem.java
   ```

4. **Run the application:**
   ```bash
   java LibrarySystem
   ```

## 💻 Usage

When you run the application, you'll see an interactive menu:

```
📚 Welcome to Library Management System!

=== MENU ===
1. View all books
2. Borrow book
3. Return book
4. Search books
5. Exit
Choose option:
```

### Sample Operations

**View All Books:**
```
=== LIBRARY CATALOG ===
ISBN: 978-0134685991 | Title: Effective Java | Author: Joshua Bloch | Available: Yes
ISBN: 978-0596009205 | Title: Head First Design Patterns | Author: Eric Freeman | Available: Yes
ISBN: 978-0132350884 | Title: Clean Code | Author: Robert Martin | Available: Yes
ISBN: 978-0201633610 | Title: Design Patterns | Author: Gang of Four | Available: Yes
```

**Borrow a Book:**
```
Enter ISBN to borrow: 978-0134685991
Book borrowed successfully! Due date: 2025-06-24
```

**Search Books:**
```
Enter title to search: design
=== SEARCH RESULTS ===
ISBN: 978-0596009205 | Title: Head First Design Patterns | Author: Eric Freeman | Available: Yes
ISBN: 978-0201633610 | Title: Design Patterns | Author: Gang of Four | Available: Yes
```

## 🏗️ System Architecture

### Core Classes

#### `Book` Class
- **Attributes**: ISBN, title, author, availability status, due date
- **Methods**: Borrow book, return book, getters/setters
- **Features**: Automatic due date calculation, status management

#### `Library` Class
- **Data Structures**: 
  - `HashMap<String, Book>` for efficient book lookup by ISBN
  - `HashSet<String>` for tracking borrowed books
- **Methods**: Add book, display catalog, borrow/return operations, search functionality
- **Features**: Pre-loaded sample data, comprehensive book management

#### `LibrarySystem` Class (Main)
- **Responsibilities**: User interface, input handling, application flow control
- **Features**: Interactive menu system, input validation, user-friendly prompts

## 🔧 Key Programming Concepts Demonstrated

### Object-Oriented Programming
- **Encapsulation**: Private fields with public getters/setters
- **Abstraction**: Clean separation of Book and Library responsibilities
- **Method Design**: Single responsibility principle in method implementation

### Data Structures & Collections
- **HashMap**: O(1) book lookup by ISBN for efficient searching
- **HashSet**: Fast borrowed books tracking and lookup
- **ArrayList**: Dynamic storage for multiple data types

### Java Features
- **Java 8 Time API**: Modern date handling with LocalDate
- **String Formatting**: Professional output formatting
- **Exception Safety**: Null-safe operations and validation

## 📊 Sample Data

The system comes pre-loaded with popular programming books:

| ISBN | Title | Author |
|------|-------|--------|
| 978-0134685991 | Effective Java | Joshua Bloch |
| 978-0596009205 | Head First Design Patterns | Eric Freeman |
| 978-0132350884 | Clean Code | Robert Martin |
| 978-0201633610 | Design Patterns | Gang of Four |

## 🚧 Future Enhancements

- [ ] **User Management**: Add librarian and member accounts
- [ ] **Database Integration**: Replace in-memory storage with persistent database
- [ ] **GUI Implementation**: Swing or JavaFX user interface
- [ ] **Fine Management**: Late return fee calculation
- [ ] **Book Categories**: Genre-based organization and filtering
- [ ] **Export Features**: Generate reports in PDF/CSV format
- [ ] **Reservation System**: Allow users to reserve borrowed books
- [ ] **Multi-branch Support**: Handle multiple library locations

## 🤝 Contributing

Contributions are welcome! Here's how you can help:

1. **Fork the repository**
2. **Create a feature branch**: `git checkout -b feature/amazing-feature`
3. **Commit your changes**: `git commit -m 'Add amazing feature'`
4. **Push to branch**: `git push origin feature/amazing-feature`
5. **Open a Pull Request**

### Contribution Guidelines
- Follow Java naming conventions
- Add comments for complex logic
- Test your changes thoroughly
- Update documentation as needed

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Author

**PixelDev-Vic**
- GitHub: [@PixelDev-Vic](https://github.com/PixelDev-Vic)

## 🙏 Acknowledgments

- Inspired by real-world library management needs
- Built as a demonstration of Java fundamentals and OOP principles
- Thanks to the Java community for excellent documentation and resources

## 📞 Support

If you encounter any issues or have questions:

1. **Check existing issues**: [GitHub Issues](https://github.com/PixelDev-Vic/library-management-system/issues)
2. **Create new issue**: Describe the problem with steps to reproduce
3. **Feature requests**: Open an issue with the "enhancement" label

---

⭐ **Star this repository if you found it helpful!**

*Last updated: June 2025*
