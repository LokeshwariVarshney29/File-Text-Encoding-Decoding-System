# 🔐 File Text Encoding-Decoding System

A comprehensive Java-based application suite that provides multiple encoding and decoding solutions for both text and file data with an intuitive GUI interface.

## 📌 Project Overview

This project consists of three separate Java applications that handle different types of encoding and decoding operations:
- **Base64 File Encoding/Decoding** - Converts files to/from Base64 format
- **Binary File Encoding/Decoding** - Applies custom binary transformations to files
- **Text Encoding/Decoding** - Handles text-based Base64 encoding/decoding

## 🚀 Features

### 1. Base64 File Encoding/Decoding System
- **File Processing**: Reads any file type and converts to Base64 format
- **Reverse Operation**: Decodes Base64 encoded files back to original format
- **GUI Interface**: Simple Swing-based interface with input/output file path fields
- **Error Handling**: Comprehensive exception handling with user-friendly error messages

### 2. Binary File Encoding/Decoding System
- **Custom Binary Transformation**: Applies byte-level manipulation (increment/decrement)
- **File Support**: Works with any binary file format
- **Reversible Process**: Encoding and decoding operations are perfectly reversible
- **GUI Interface**: Similar interface design for consistent user experience

### 3. Text Encoding/Decoding System
- **Direct Text Processing**: Encode/decode text strings without file operations
- **Base64 Implementation**: Uses standard Base64 encoding for text transformation
- **Real-time Processing**: Instant encoding/decoding with immediate output display
- **User-friendly Interface**: Simple text input/output fields

## 🛠️ Technical Stack

- **Language**: Java
- **GUI Framework**: Swing (javax.swing)
- **File I/O**: Java NIO (java.nio.file)
- **Encoding Library**: java.util.Base64
- **Architecture**: Event-driven GUI applications

## 📂 Project Structure

```
File-Text-Encoding-Decoding-System/
├── FileEncodingDecoding System-Base64/
│   └── FileEncodingDecoding.java
├── FileEncodingDecoding System-Binary/
│   └── BinaryEncodingDecoding.java
└── TextEncodingDecoding System/
    └── TextEncodingDecoding.java
```

## 🔧 Installation & Usage

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Java Runtime Environment (JRE)

### Running the Applications

1. **Base64 File Encoder/Decoder**:
   ```bash
   cd "FileEncodingDecoding System-Base64"
   javac FileEncodingDecoding.java
   java FileEncodingDecoding
   ```

2. **Binary File Encoder/Decoder**:
   ```bash
   cd "FileEncodingDecoding System-Binary"
   javac BinaryEncodingDecoding.java
   java BinaryEncodingDecoding
   ```

3. **Text Encoder/Decoder**:
   ```bash
   cd "TextEncodingDecoding System"
   javac TextEncodingDecoding.java
   java TextEncodingDecoding
   ```

## 💡 How to Use

### File-based Systems (Base64 & Binary)
1. Launch the application
2. Enter the **Input File** path (source file)
3. Enter the **Output File** path (destination file)
4. Click **Encode** to transform the file
5. Click **Decode** to reverse the transformation

### Text-based System
1. Launch the application
2. Enter text in the **Input Text** field
3. Click **Encode** to see Base64 encoded output
4. Enter encoded text and click **Decode** to see original text

## 🔍 Use Cases

- **File Security**: Encode sensitive files for basic obfuscation
- **Data Transmission**: Prepare files for text-based transmission protocols
- **Text Processing**: Quick Base64 encoding/decoding for development work
- **Educational**: Learn about different encoding mechanisms
- **Data Backup**: Create encoded backups of important files

## ⚠️ Important Notes

- **Binary Encoding**: Uses simple byte increment/decrement - not cryptographically secure
- **File Paths**: Ensure proper file paths and permissions
- **Error Handling**: Application displays error messages for invalid operations
- **File Size**: Large files may require additional memory considerations

## 🚀 Future Enhancements

- Add support for multiple encoding algorithms (Hex, URL encoding)
- Implement file drag-and-drop functionality
- Add batch processing capabilities
- Include encryption/decryption features
- Implement progress bars for large file operations
- Add file format validation

## 🧪 Testing

Test the applications with:
- Text files (.txt, .csv, .json)
- Image files (.jpg, .png, .gif)
- Document files (.pdf, .doc)
- Binary files (.exe, .zip)

## 👩‍💻 Author

**Lokeshwari Varshney**

Java Developer & Software Engineering Enthusiast
