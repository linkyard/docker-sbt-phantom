SBT in a Docker Container together with PhantomJS
=================================================
Docker images that packages Java, [sbt](http://www.scala-sbt.org/) and PhantomJS.
To be used in builds for the end-to-end tests.

Usage: `docker run linkyard/docker-sbt-phantom`

Versions
--------
* SBT: 0.13.13
* Java: JDK 8
* Scala (preinitialized): 2.12.1 and 2.11.8
* PhantomJS: 2.1.1

Details
-------
* Uses the OpenJDK image as its base
* sbt is preinitialized, so running it for the first time will not take forever
* the compiler interfaces are already built, so the compilation will be reasonably fast
