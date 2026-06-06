# 🎓 Student Information Transfer System (Socket Programming)

### 📌 Course Information
- **Course Code:** SE-409
- **Course Title:** Advanced Enterprise Java
- **Assignment:** Student Information Sender using Java Sockets & Collections

---

## 🚀 Project Overview
This project is a real-time **Client-Server Application** developed in Java. It demonstrates how data can be collected from a client, transmitted over a network using **Socket Programming**, and managed on a server using **Java Collections (HashMap & Arrays)**.

### 🎯 Why This Project?
The goal of this assignment was to understand:
1. **Inter-Process Communication:** How two different Java programs (Client and Server) talk to each other.
2. **Network Programming:** Using `ServerSocket` and `Socket` classes.
3. **Data Management:** Organizing received data efficiently using `HashMap` (for fast lookup) and `Arrays` (for sequential storage).

---

## ✨ Features
- ✅ **Dynamic Input:** Client takes Student ID, Name, and Marks via `Scanner`.
- ✅ **Network Transmission:** Data is sent as a formatted string over a specific port.
- ✅ **Server-Side Storage:** 
    - Uses `HashMap<Integer, Integer[]>` to link Student IDs with their Marks.
    - Uses a `String Array` to store Student Names.
- ✅ **Real-time Display:** Server prints all received records instantly upon arrival.

---

## 🏗️ Architecture
1. **Client Side:** Acts as the data entry point. It creates a connection to the server's IP and Port.
2. **Server Side:** Acts as the listener. It stays "Online", accepts connections, processes incoming strings, and stores them in memory.

---

## 🛠️ Tech Stack
- **Language:** Java (JDK 17+)
- **Networking:** Java Sockets (`java.net.*`)
- **Collections:** `HashMap`, `ArrayList`, `Arrays` (`java.util.*`)
- **I/O Streams:** `BufferedReader`, `PrintWriter` (`java.io.*`)

---

## 📂 Project Structure
```text
student-info-sender/
│
├── ClientApp.java     # The client-side application (Sender)
└── ServerApp.java     # The server-side application (Receiver & Manager)