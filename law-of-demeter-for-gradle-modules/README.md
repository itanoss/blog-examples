# *Law of Demeter* for Gradle modules

No demo.

## Modules

* bad-library : A module as dependency that exposes its own dependencies. 
* bad-client : A module dependent on bad-library.
* good-library : A module as dependency that follows Law of Demeter well. 
* good-client : A module dependent on good-library.