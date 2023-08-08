# QR Code Reader Application

This is a simple QR Code reader application developed using Java and JavaFX. The application utilizes the computer's webcam to scan QR codes and display the decoded information on the user interface.
![image](https://github.com/Lakshan-Chamoditha-Perera/QR-Code-Reader/blob/main/src/main/resources/com/example/qrcodereader/assets/ui.png)
## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Contributing](#contributing)
- [Acknowledgements](#acknowledgements)

## Features

- Scan QR codes using your computer's webcam.
- Display decoded QR code information on the user interface.
- Start and stop the webcam feed for scanning.
- Responsive user interface design using JavaFX.
- Error handling and alerts for various scenarios.
- Clear the displayed information with a single click.


## Technologies Used

- Java
- JavaFX
- Maven
- ZXing (Zebra Crossing) Library
- Webcam Library by sarxos

## Dependencies

The following dependencies are used in this project:

- [ZXing (Zebra Crossing) Library](https://github.com/zxing/zxing): A powerful library for detecting and decoding barcodes and QR codes. It's used here for QR code decoding functionality.
- [Webcam Library by sarxos](https://github.com/sarxos/webcam-capture): This library provides a simple way to capture images and video from webcams. It's used for webcam integration in the application.

## Getting Started

To run the application, make sure you have Java and Maven installed on your system. Follow these steps:

1. Clone this repository to your local machine.
2. Build the project using Maven.
3. Run the application.

## Usage

1. Launch the application by following the "Getting Started" instructions.
2. Click the "Start" button to initiate the webcam feed and start scanning for QR codes.
3. Hold a QR code in front of the webcam.
4. Once a QR code is detected and decoded, the information will be displayed in the text area.
5. Click the "Pause" button to halt the webcam feed and scanning.
6. You can clear the displayed information by clicking the "Clear" button.

## Contributing

Contributions are welcome! If you find any issues or have ideas to improve the application, feel free to submit a pull request or open an issue.

## Acknowledgements

- The QR Code decoding functionality is powered by the ZXing library.
- The webcam integration is made possible by the Webcam library by sarxos.
