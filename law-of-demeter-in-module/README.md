# **Law of Demeter** ([Wikipedia](https://en.wikipedia.org/wiki/Law_of_Demeter)) in modules

No demo. Look at the code.

## Modules

* bad-library : A module as dependency that exposes its own dependencies. 
* bad-client : A module dependent on bad-library.
* good-library : A module as dependency that follows Law of Demeter well. 
* good-client : A module dependent on good-library.