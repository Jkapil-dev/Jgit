# Jgit
# JGit - Build Your Own Git in Java
## ⚡ Quick Start

### Compile

```bash
cd src
javac Main.java
```

---

## 🖥️ Available Commands

### `init`

Initializes a new **JGit repository** in the current directory.

```bash
java Main init
```

**What it does**

* Creates the hidden `.jgit/` folder
* Creates `commits/`
* Creates `objects/`
* Creates `refs/`
* Creates the `HEAD` file

**Example output**

```text
Initialized empty JGit repository.
```

**Directory created**

```text
.jgit/
├── commits/
├── objects/
├── refs/
└── HEAD
```

---

### `status`

Displays the files in the current working directory that are **not yet tracked** by JGit.

```bash
java Main status
```

**What it does**

* Scans the current directory
* Ignores the `.jgit` folder
* Ignores directories
* Prints regular files as **Untracked files**

**Example output**

```text
Untracked files:

Main.java
hello.txt
README.md
```

---

### Invalid Command

```bash
java Main random
```

**Output**

```text
Unknown command.
```

---

### No Command

```bash
java Main
```

**Output**

```text
Usage: java Main <command>
```

---

## 🚀 Typical Workflow

```bash
# Move to source folder
cd src

# Compile the project
javac Main.java

# Initialize repository
java Main init

# Check project status
java Main status
```

---

## 📌 Command Summary

| Command               | Purpose                         |
| --------------------- | ------------------------------- |
| `java Main init`      | Create a new `.jgit` repository |
| `java Main status`    | Show untracked files            |
| `java Main`           | Display usage information       |
| `java Main <unknown>` | Show *Unknown command*          |

---

## 🔍 Current Working Commands

| Feature    | Status                         |
| ---------- | ------------------------------ |
| `init`     | ✅ Working                      |
| `status`   | 🚧 In Progress / Basic Version |
| `add`      | ❌ Not Implemented              |
| `commit`   | ❌ Not Implemented              |
| `log`      | ❌ Not Implemented              |
| `checkout` | ❌ Not Implemented              |


A simplified Git implementation built from scratch in **pure Java** to understand how version control systems work internally.

This project is being developed step-by-step as a learning exercise focused on **file systems, hashing, object-oriented design, and command-line applications**.

---

## 🚀 Current Features

Implemented so far:

* `init` → Initialize a `.jgit` repository
* `status` → Work in progress (basic file scanning phase)

Planned features:

* `add`
* `commit`
* `log`
* `checkout`
* `branch`
* `merge`
* `diff`

---

## 📁 Project Structure

```text
JGit/
│
├── src/
│   ├── Main.java
│   │
│   ├── commands/
│   │   └── CommandHandler.java
│   │
│   ├── repository/
│   │   ├── Repository.java
│   │   └── Status.java
│   │
│   └── utils/
│
└── README.md
```

After running `init`, the repository structure becomes:

```text
JGit/
│
├── src/
├── README.md
│
└── .jgit/
    ├── commits/
    ├── objects/
    ├── refs/
    └── HEAD
```

---

## 🛠️ Technologies Used

* **Java 8+**
* `java.io.File`
* `java.nio.file` (planned)
* OOP principles
* Command-line interface (CLI)

No external libraries or frameworks are used.

---

## ▶️ How to Run

### 1. Open Terminal

Navigate to the `src` directory:

```bash
cd JGit/src
```

### 2. Compile

```bash
javac Main.java
```

### 3. Run Commands

```bash
java Main <command>
```

---

## ✅ Working Commands

### Initialize Repository

```bash
java Main init
```

Example output:

```text
Initialized empty JGit repository.
```

This creates:

```text
.jgit/
├── commits/
├── objects/
├── refs/
└── HEAD
```

---

### Invalid Command

```bash
java Main abc
```

Output:

```text
Unknown command.
```

---

### No Command

```bash
java Main
```

Output:

```text
Usage: java Main <command>
```

---

## 🔧 Internal Architecture

The project follows a layered structure:

```text
User
  │
  ▼
Main
  │
  ▼
CommandHandler
  │
  ▼
Repository
  │
  ▼
File System
```

### Responsibilities

| Class            | Responsibility                   |
| ---------------- | -------------------------------- |
| `Main`           | Reads command-line arguments     |
| `CommandHandler` | Dispatches commands              |
| `Repository`     | Handles repository operations    |
| `Status`         | Scans working directory          |
| `utils`          | Shared helper utilities (future) |

This keeps the code modular and easier to extend.

---

## 📚 What This Project Teaches

By building Git manually, the project covers:

* File and directory handling
* Hidden repository structure
* Command parsing
* Object-oriented design
* Error handling
* Working with the filesystem safely
* Layered application architecture

Future phases will introduce:

* SHA-1 hashing
* Object storage
* Staging area (index)
* Commit snapshots
* Branch references
* Checkout and restore operations

---

## 🗺️ Development Roadmap

### Phase 1 - Repository Initialization ✅

* [x] CLI setup
* [x] `init` command
* [x] `.jgit` directory creation
* [x] `HEAD` file creation

### Phase 2 - Status Command 🚧

* [ ] Scan current directory
* [ ] Ignore `.jgit`
* [ ] Detect regular files
* [ ] Display untracked files

### Phase 3 - Object Database

* [ ] SHA-1 hashing
* [ ] Blob object creation
* [ ] Store file contents in `.jgit/objects`

### Phase 4 - Staging Area

* [ ] `add` command
* [ ] Index file
* [ ] Track staged files

### Phase 5 - Commits

* [ ] Create commit objects
* [ ] Store metadata
* [ ] Link parent commits

### Phase 6 - History

* [ ] `log` command
* [ ] Read commit chain
* [ ] Pretty-print history

---

## 💡 Example Session

```bash
# Compile
javac Main.java

# Initialize repository
java Main init

# Check status (work in progress)
java Main status
```

Expected directory:

```text
MyProject/
├── Main.java
├── hello.txt
└── .jgit/
```

---

## 🎯 Goal

The objective is **not to replace Git**, but to understand:

> **How a version control system works internally by implementing its core ideas from scratch.**

Being able to explain in an interview:

> *"I implemented a simplified Git system in Java, including repository initialization, object storage, staging, commits, and history traversal."*

is a much stronger demonstration of backend and systems programming skills than a typical CRUD project.

---

## 📌 Current Status

| Feature                   | Status         |
| ------------------------- | -------------- |
| CLI Argument Parsing      | ✅              |
| Command Handler           | ✅              |
| Repository Initialization | ✅              |
| `.jgit` Structure         | ✅              |
| HEAD File Creation        | ✅              |
| Status Command            | 🚧 In Progress |
| Add                       | ❌              |
| Commit                    | ❌              |
| Log                       | ❌              |
| Checkout                  | ❌              |

---

## 👨‍💻 Author

**Kapil Joshi**

Built as a hands-on systems programming and backend learning project using **pure Java**.

---

## ⭐ Future Vision

Planned advanced capabilities:

* Branch creation and switching
* Merge commits
* File diffs
* Tags
* Remote repositories
* Push / pull simulation
* Better CLI formatting
* Cross-platform path handling

---

### "Git is just a directory with a very good memory."

This project is about building that memory yourself.
