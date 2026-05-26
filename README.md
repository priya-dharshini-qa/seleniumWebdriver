# Selenium WebDriver - Java Test Automation Framework

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![Selenium 4](https://img.shields.io/badge/Selenium-4.x-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![Eclipse](https://img.shields.io/badge/Eclipse-2C2255?style=for-the-badge&logo=eclipse&logoColor=white)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

This project demonstrates hands-on Selenium WebDriver automation in Java across 14 topic areas, tested against real UK retail websites (Asda, Sainsbury's, Tesco). It showcases a broad range of automation skills including locator strategies, synchronisation techniques, browser interactions, and file handling — all using the modern Selenium 4 API with built-in Selenium Manager (no manual driver setup required).

---

## 📁 Project Structure

```
web-automation-selenium-java/
│
├── 01_WebDriver/               # All automation scripts organised by topic
│   ├── ch01/browserdriver/     # Browser & driver setup
│   ├── ch02/Locators/          # All 8 locator strategies
│   ├── ch03/basics/            # Core WebDriver commands
│   ├── ch04/headless/          # Headless Chrome & Firefox
│   ├── ch05/customcss/         # Custom CSS selectors
│   ├── ch06/customisexpath/    # Custom XPath expressions
│   ├── ch07/synchronisation/   # Implicit, Explicit & Fluent waits
│   ├── ch08/checkbox_dropdown_radiobutton/
│   ├── ch09/conditionalstatements/
│   ├── ch10/screenshot/        # Screenshot capture
│   ├── ch11/actioncommands/    # Mouse & keyboard Actions API
│   ├── ch12/multipletabs/      # Multi-tab & window handling
│   ├── ch13/accesstextfiles/   # File I/O with Java
│   └── ch14/comments/          # Code documentation examples
├── Resource/                   # Test data, screenshots, driver files
├── src/                        # Module configuration
├── .gitignore                  # Git ignore rules
└── README.md                   # Project documentation
```

---

## 🚀 Topics Covered

| Chapter | Topic | Key Concepts |
|---------|-------|-------------|
| ch01 | Browser & Driver Setup | ChromeDriver, Firefox, Edge, Selenium Manager |
| ch02 | Locators | ID, Name, ClassName, LinkText, TagName, CSS, XPath |
| ch03 | Core Commands | get, navigate, sendKeys, clear, getText, isDisplayed |
| ch04 | Headless Mode | Chrome & Firefox headless execution |
| ch05 | CSS Selectors | ID, class, nth-child, prefix, suffix, substring |
| ch06 | XPath | text(), contains(), starts-with(), relative locators |
| ch07 | Synchronisation | Thread.sleep, implicitlyWait, WebDriverWait, FluentWait |
| ch08 | Form Elements | Checkboxes, radio buttons, dropdowns (Select API) |
| ch09 | Conditionals | if/else, for loop, forEach with web elements |
| ch10 | Screenshots | Full page, element-level, timestamped captures |
| ch11 | Actions API | Click, double-click, right-click, drag-and-drop, slider |
| ch12 | Tabs & Windows | switchTo, WindowType (Selenium 4), window handles |
| ch13 | File Handling | Create, read, write, copy, delete files & directories |
| ch14 | Code Quality | JavaDoc comments and documentation standards |

---

## 🛠️ Prerequisites

| Tool | Version |
|------|---------|
| Java JDK | 8 or above |
| Eclipse IDE | Latest |
| Selenium WebDriver | 4.x |

> **No driver download needed.** This project uses Selenium Manager (built into Selenium 4.6+), which automatically manages ChromeDriver and GeckoDriver. Just clone and run.

---

## ⚙️ Setup & Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/priyadharshini-qa/web-automation-selenium-java.git
   ```

2. **Open in Eclipse**
   - File → Import → Existing Projects into Workspace
   - Browse to the cloned folder → Finish

3. **Add Selenium JAR files**
   - Right-click project → Build Path → Add External JARs
   - Add all Selenium JARs from the `Resource/` folder

4. **Run a script**
   - Navigate to any chapter under `01_WebDriver/`
   - Right-click the Java file → Run As → Java Application

---

## 📌 How to Use

```java
// Launch browser — no manual driver setup needed with Selenium Manager
WebDriver driver = new ChromeDriver();
driver.get("https://www.asda.co.uk/");
driver.manage().window().maximize();

// Wait for an element and interact with it
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("elementId")));
element.click();

// Always quit to close the browser process cleanly
driver.quit();
```

---

## 👩‍💻 Author

**Priyadharshini Chinnaiyan**

- GitHub: [@priyadharshini-qa](https://github.com/priyadharshini-qa)
- LinkedIn: [linkedin.com/in/priyadharshinichinnaiyan](https://www.linkedin.com/in/priyadharshinichinnaiyan/)

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).

---

⭐ If this project helped you, please give it a star!
