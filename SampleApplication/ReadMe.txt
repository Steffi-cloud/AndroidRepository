Application temporary name is SampleApplication

The first part consists of the client should be able to register into the application

for that a component consists of a theme and a layout is there under the below paths


\SampleApplication\app\src\main\java\com\example\sampleapplication\ui\theme\ClientRegistration.kt---this is a kotlin file for the text fonts
,label fonts and title fonts

the layout is under this path


\SampleApplication\app\src\main\res\layout\client.xml

this is a layout bydefault created for google pixel phone as per supported by android studio ,since android studio supports all containers for deployment

of android apps

Below is the main class written in kotlin

\SampleApplication\app\src\main\java\com\example\sampleapplication\MainActivity.kt

which has a couple of methods  

out of that it starts with initialising the instance on the container by overriding onCreate method

the view meaning what will be rendered on screen is provided by  setContentView(R.layout.client) where the R.layout.xxx --this xxx file denotes the file 

under layout folder

in the setContent method The ClientRegistration is initialised with the functions of validation the email address and phone 

and after that invoking the Greeting method

which renders a message of the user successfully registering in the application


NB:none of this is run or test cases written for it
