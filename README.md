# 🚀 solution_homework_7 🚀


## 🔭 Overview
This repo showcases two classic Java design patterns—served with a side of rocket fuel! 🎉

1. **Iterator Pattern** (`streaming`) 🚀  
   - Walk through a list of `Episode` objects in:
     - ➡️ **Normal** (`SeasonIterator`)
     - 🔄 **Reverse** (`ReverseSeasonIterator`)
     - 🎲 **Shuffle** (fixed‐seed `ShuffleSeasonIterator`)  
   - Chain whole seasons into a “binge” marathon with `BingeIterator`.  
   - Leverage `Iterable<Episode>` to power your `for (Episode e : season)` and `for (Episode e : series)` loops.

2. **Mediator Pattern** (`airport`) ✈️  
   - Central hub (`ControlTower`) for aircraft communication.  
   - Aircraft types (`PassengerPlane`, `CargoPlane`, `Helicopter`) request LANDING, TAKEOFF, or trigger MAYDAY emergencies.  
   - Tower keeps separate queues, fast-tracks emergencies, and broadcasts instructions.

---
HERE MY UML DIAGRAM:
![UML diagram to Iterator and MEdiator](image/1.png) 

## 📂 Project Structure
├─ src/
│ ├─ Episode.java
│ ├─ EpisodeIterator.java
│ ├─ Season.java
│ ├─ SeasonIterator.java
│ ├─ ReverseSeasonIterator.java
│ ├─ ShuffleSeasonIterator.java
│ ├─ Series.java
│ ├─ BingeIterator.java
│ ├─ TowerMediator.java
│ ├─ Operation.java
│ ├─ ControlTower.java
│ ├─ Aircraft.java
│ ├─ PassengerPlane.java
│ ├─ CargoPlane.java
│ ├─ Helicopter.java
│ └─ Application.java
└─ README.md

##⚖️ EXAMPLE OUTPUT
== Normal ==
Pilot
Cliffhanger

== Reverse ==
Cliffhanger
Pilot

== Shuffle (seed=42) ==
Pilot
Cliffhanger

== Binge ==
Pilot
Cliffhanger

== Mediator ==
PassengerPlane P1: Cleared to land.
Helicopter H1: Cleared for takeoff.
CargoPlane C1: Cleared to land.
