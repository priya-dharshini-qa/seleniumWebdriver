# 🌐 Selenium WebDriver - Java Test Automation Framework

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![Eclipse](https://img.shields.io/badge/Eclipse-2C2255?style=for-the-badge&logo=eclipse&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

A beginner-to-advanced **Selenium WebDriver** automation project built with Java, covering core WebDriver concepts and real-world test scenarios.

---

## 📁 Project Structure

```
seleniumWebdriver/
│
├── src/                        # Source files - Java test scripts
├── 01_WebDriver/               # WebDriver basics and examples
├── Resource/                   # Test resources (drivers, test data, configs)
├── bin/                        # Compiled class files
├── .settings/                  # Eclipse project settings
├── .classpath                  # Eclipse classpath configuration
├── .project                    # Eclipse project file
└── README.md                   # Project documentation
```

---

## 🚀 Topics Covered

- ✅ WebDriver Setup & Browser Configuration
- ✅ Locators (ID, Name, XPath, CSS Selector, LinkText)
- ✅ Browser Navigation & Window Handling
- ✅ Form Interactions (Input, Click, Submit)
- ✅ Dropdowns & Checkboxes
- ✅ Alerts & Pop-ups
- ✅ Frames & iFrames
- ✅ Wait Strategies (Implicit, Explicit, Fluent)
- ✅ Screenshot Capture
- ✅ Mouse & Keyboard Actions

---

## 🛠️ Prerequisites

Make sure you have the following installed:

| Tool | Version |
|------|---------|
| Java JDK | 8 or above |
| Eclipse IDE | Latest |
| Selenium WebDriver | 4.x |
| ChromeDriver / GeckoDriver | Compatible with your browser |

---

## ⚙️ Setup & Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/priya-dharshini-qa/seleniumWebdriver.git
   ```

2. **Open in Eclipse**
   - File → Import → Existing Projects into Workspace
   - Browse to the cloned folder → Finish

3. **Add Selenium JAR files**
   - Right-click project → Build Path → Add External JARs
   - Add all Selenium JARs from the `Resource/` folder

4. **Set up WebDriver**
   - Download ChromeDriver from [chromedriver.chromium.org](https://chromedriver.chromium.org)
   - Place it inside the `Resource/` folder

5. **Run a test**
   - Right-click any Java file → Run As → Java Application

---

## 📌 How to Use

```java
// Example: Launch browser and open a URL
WebDriver driver = new ChromeDriver();
driver.get("https://www.example.com");
driver.manage().window().maximize();

// Find element and click
driver.findElement(By.id("elementId")).click();

// Close browser
driver.quit();
```

---

## 👩‍💻 Author

**Priyadharshini**
- GitHub: [@priya-dharshini-qa](https://github.com/priya-dharshini-qa)

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).

---

⭐ **If this project helped you, please give it a star!**
