Your company is writing the firmware for an alarm clock which will speak the time, so it can be used in the night and for people with visual disabilities.  
The hardware contains a speech synthesiser, which will read out textual input. 
You have been asked to write the software to convert a system time into the full text in English, 
as in the examples below. The clock runs on the JVM platform. 
Your code needs to run as a service which can be injected into the running application.


|System Time	|English|
|-------|---------|
|00:00	|	midnight|
|08:34	|	eight thirty four in the morning|
|12:00	|	midday|
|15:04	|	three oh four in the afternoon|
|21:00	|	nine o'clock in the evening|