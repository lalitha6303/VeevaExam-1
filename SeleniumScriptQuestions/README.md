# Selenium Script Questions

## Overview

This folder contains Selenium WebDriver automation scripts covering form submission and validation, JavaScript alerts, and multiple browser window/tab handling.

The programs demonstrate practical browser automation using Java and Selenium WebDriver.

---

# Question 1: Dynamic Form Submission & Validation

## Problem Statement

Write a Selenium script to navigate to a registration page and automate the registration form.

The script should perform the following operations:

1. Enter Name, Email, and Password into their respective text fields.
2. Select a country from a standard HTML `<select>` dropdown using visible text.
3. Check the Terms & Conditions checkbox only if it is not already selected.
4. Click the Submit button.
5. Verify the success message displayed after submission.

## Concepts Used

- Selenium WebDriver
- WebElement
- Locators (By.id, By.name, By.xpath)
- Select Class
- `selectByVisibleText()`
- `isSelected()`
- `sendKeys()`
- `click()`
- `getText()`
- Validation of success messages

## Expected Execution

- Registration form fields are filled successfully.
- Country is selected from the dropdown.
- Checkbox is selected conditionally.
- Form is submitted.
- Success message is verified.

---

# Question 2: Handling JavaScript Alerts & Pop-ups

## Problem Statement

Write a Selenium script to handle JavaScript Confirmation and Prompt Alerts.

The script should perform the following operations:

1. Click a button that triggers a JavaScript Confirmation Alert.
2. Switch the driver control to the alert using `driver.switchTo().alert()`.
3. Retrieve and print the alert message using `getText()`.
4. Accept the confirmation alert using `accept()`.
5. Trigger a Prompt Alert.
6. Enter `"Automation Test"` into the prompt using `sendKeys()`.
7. Dismiss the prompt using `dismiss()`.

## Concepts Used

- Selenium WebDriver
- JavaScript Alerts
- Confirmation Alert
- Prompt Alert
- `driver.switchTo().alert()`
- `getText()`
- `accept()`
- `sendKeys()`
- `dismiss()`

## Expected Execution

- Confirmation alert text is printed in the console.
- Confirmation alert is accepted.
- Prompt alert is triggered.
- Text is entered into the prompt.
- Prompt alert is dismissed.

---

# Question 3: Multi-Window / Tab Handling

## Problem Statement

Write a Selenium script to handle multiple browser windows or tabs.

The script should perform the following operations:

1. Open a webpage containing a link that opens in a new browser tab.
2. Capture the parent window ID using `getWindowHandle()`.
3. Click the link to open the child tab.
4. Retrieve all window IDs using `getWindowHandles()`.
5. Iterate through the window IDs and switch to the newly opened child tab.
6. Extract and print the child tab's page title using `getTitle()`.
7. Close only the active child tab using `driver.close()`.
8. Switch control back to the parent window using its window ID.

## Concepts Used

- Selenium WebDriver
- Browser Windows and Tabs
- `getWindowHandle()`
- `getWindowHandles()`
- `switchTo().window()`
- `getTitle()`
- `driver.close()`
- Window Handle Iteration

## Expected Execution

- Parent browser window is opened.
- Clicking the link opens a new tab.
- Selenium switches to the child tab.
- Child tab title is printed in the console.
- Child tab is closed.
- Control returns to the parent window.

---

## Technologies Used

- Programming Language: Java
- Automation Tool: Selenium WebDriver
- Browser: Google Chrome
- Browser Driver: ChromeDriver
- IDE: IntelliJ IDEA




