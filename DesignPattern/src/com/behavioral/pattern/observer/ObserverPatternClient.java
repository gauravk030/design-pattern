package com.behavioral.pattern.observer;

/**
 * Observer Pattern:
 *
 * Suppose we have a weather station that records the temperature.So there is a weather station with sensors that's going to record temperature.
 * And there are going to be multiple devices where we want to show the latest temperature.So all these devices, they are kind of
 * going to observe what temperature is going to be on the weather station.Suppose it is recording 26.So every device will show 26 2626.
 * But suppose as the sun rises the temperature is going to increase.So we need a mechanism to notify that these devices that you should now display 27.
 * So it's kind of a problem statement.
 *
 * So now without using the observer pattern, what we have and what we can do in code, the weather station would have to explicitly inform each devices.
 * So you have to say okay fine go and update this device as soon as the temperature changes, you have to explicitly inform each device about the
 * temperature change, which results in a tight coupling between the station and the devices.
 *
 * Benefits
 * Loose coupling:- We are storing the reference of the type on display device.
 * Scalability:- new observers can be easily added without changing the subject.
 * flexibility:- We can dynamically add or remove observers on the runtime.
 *
 * Use cases:
 * 1) Event listeners.
 * We use observer pattern for handling button clicks.Now button is an observer sorry button is a subject.And there must be elements
 * which are observing that okay something has to change on a button click or input changes.
 *
 * 2) Stock price monitoring
 * Stock price will have a data source.And there will be a lot of guys or multiple subscribers where the updated price can be shown.
 *
 * 3) News publishing systems: whenever a news articles are published(subject), the subscribers(users) are notified whenever a new article is available,
 * and social media notifications logging systems are some more applications where observer pattern can be used.
 *
 * 4) Social media notification: User can be subscribe to update from the specific account, and when the accout posts(subject).All the
 * follower(observers)are notified.
 *
 * 5) Logging System:Different logging handlers can observe event and log them as a needed, such as to the console,file,remote server.
 */

public class ObserverPatternClient {
    public static void main(String[] args) {
        //Create Publisher
        WeatherStation weatherStation = new WeatherStation();

        //Create subscriber
        DisplayDevice displayDevice = new DisplayDevice("SumsugLCD");
        MobileDevice mobileDevice = new MobileDevice("Iphone");
        weatherStation.attach(displayDevice);
        weatherStation.attach(mobileDevice);
        weatherStation.setTemperature(30);
    }
}
