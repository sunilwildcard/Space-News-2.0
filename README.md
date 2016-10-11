# Space-News-2.0
InOrbit, an application that provides information about future space agency missions, bodies in space, meteorites, astronaut spacewalks, and news sourced from The New York Times, The Guardian, and NPR's APIs. 

A heavy overhaul of "Space News," I use my experiences in developing a news aggregator and learning to communicate with REST APIs to create a more refined app, which represents data from a number of sources including: 

The New York Times

The Guardian 

NPR 

NASA's Near Earth Object Dataset

NASA's Extra-Vehicular Activity Dataset

NASA's Metorite Landing Dataset

LaunchLibrary's API endpoint for Future Space Missions 

"Where is the ISS" for latitude-longitude data to represent in a MapView 

Flickr API for images sourced by NASA 

API Calls are made with Square's excellent Retrofit 2.0 Library 

This app is an exercise in managing a multitude of network calls while aiming to provide a fluid user experience. As development continues, design considerations regarding data persistence and multithreading will help to reduce loadtimes, as the above-mentioned API data will be separated into several RecyclerViews represented within a ViewPager
