# Everyday Simplifier 
## Let your voice take command over your actions !

#### Everyday Simplifier is a Google Assistant integrated application that simplifies access to information needed by PICT Students.
#### It uses the in-built Google Assistant on Student's device to provide access to everyday information in a timely manner using just Voice Commands!

#### Yes. You Read correct. Voice Commands only. Don't Believe on words, see Everyday Simplifier in Action through this video provided next.

## Video Walkthrough of Everyday Simplifier
> https://youtu.be/DJKYXXjw6no

## Operations Supported through Voice Commands

- [x] Invoke Everyday Simplifier Assistant using **"OK Google, Talk to Simplifier Assistant"**

- [x] Link Everyday Simplifier and Student's Google Account.

- [x] Show Student's Next Lecture or Lab using **"Next Lecture"**

- [x] Fetch Student's attendance using **"Show my attendance"**

- [x] Browse Upcoming Sessions or Events in PICT using **"Upcoming events"**

- [x] View Canteen's Menu using **"What's today's mess Menu? "**

## Helper/ Supporting Entities

- Admin Android Application
  -  > Add Seminar/Event details 
  -  > Add Lecture / Lab Details
  -  > Add Canteen Lunch/ Dinner Details

## Video Walkthrough of Android Application

> https://youtu.be/y9WbK7BSkcg

## Technology Stack

- Actions on Google
- Firestore Database
- Firebase Storage
- Hosted Firebase Cloud Functions using Node.js
- Cherio Web Parser

## Note for Testers & Evaluators

- The _Next Lecture_ feature was tested after college hours in the video, therefore it shows __College Done for today__ .
- The [Screenshot](https://image.ibb.co/dqzixe/Whats_App_Image_2018_08_17_at_07_03_15.jpg) for the same during college hours is attached  , it shows the accurate lecture name and location.
- The _My Attendance_ feature works correctly. But the ETH Server was down for the entire day. Proof in video.
- Kindly look at assistant_server code where __Web Scraping is done to retrive attendance__ .
- The Actions on Google Code is hosted on Firebase Cloud Fucntions and has been deployed __only on one device__ as shown in the video
- It requires entire one day to deploy Actions on Google on Alpha Testing mode.Kindly evaluate accordingly as it can run on developer's   Google Account only.
- Reference - https://developers.google.com/actions/dialogflow/submit

## Database Schema

- #### Lecture Collection

![screenshot 8](https://user-images.githubusercontent.com/42034989/44271557-4adc3000-a1ef-11e8-9692-29a4644f2995.png)

- #### Event Collection

![screenshot 9](https://user-images.githubusercontent.com/42034989/44271746-ca69ff00-a1ef-11e8-8c6e-dc64ea7dee6a.png)

- #### User Collection

![screenshot 10](https://user-images.githubusercontent.com/42034989/44271749-cdfd8600-a1ef-11e8-836b-ebb5a9da2cae.png)
