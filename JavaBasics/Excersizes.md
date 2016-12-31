1. Create 3 classes, one super class and 2 sub classes
2. Super class name is "WebDriver"
3. "WebDriver" should be in package "selenium.webdriver"
    - WebDriver should contains the following methods
    - startDriver()
        - print some message when method is executed
    - stopDriver()
        - print some message when method is executed
    - getUrl()
        - This accepts URL as a string
        - print the URL that is passed
    - maximizeWindow()
        - print a message
    - Instance variables
        - url
        - timeout
        - options
    - constructors
        - default constructor
           - print some message
        - one argument 'timeout'
           - print message
           - print the timeout value supplied
        - with 3 arguments
           - print all the values that are supplied

4. Sub classes are "FirefoxDriver" and "ChromeDriver"
        
5. "FirefoxDriver" should be in package "selenium.webdriver", 
    - it should contains the following methods
        - startDriver()
        - stopDriver()
        - getUrl()
        - maximizeWindow()
    
6. "ChromeDriver" should be in package "selenium.webdriver", 
    - it should contains the following methods
        - startDriver()
        - stopDriver()
        - getUrl()
        - maximizeWindow()

7. Common for all the sub classes
    - Use method overriding for "start, stop and getUrl" methods
    - Use overriding annotation "@override"

8. Create objects for all the classes
    - Create object for sub class using super class i.e. WebDriver dr = new FireFoxDriver();   