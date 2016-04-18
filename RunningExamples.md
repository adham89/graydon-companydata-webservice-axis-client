How to run the examples within this project

## Introduction ##

This document gives you brief instructions on how to run the java axis client classes provided in the graydonCompanyDataWebservices\_Examples jar.

## Details ##

**1.** Requirements

|Download the graydonCompanyDataWebservices\_Examples.jar|
|:-------------------------------------------------------|
|Download the latest version of Apache Axis http://ws.apache.org/axis/|

**2.** Make sure the Apache Axis .jars and the graydonCompanyDataWebservices\_Examples.jar are in your classpath.

|**set AXIS\_LIB**=(Axis jars Path)|
|:---------------------------------|
|**set GRAYDON\_LIB**=(Graydon Client jars Path)|
|**set CLASSPATH**=%AXIS\_LIB%\axis.jar;%AXIS\_LIB%\commons-discovery-0.2.jar;%AXIS\_LIB%\commons-logging-1.0.4.jar;%AXIS\_LIB%\jaxrpc.jar;%AXIS\_LIB%\saaj.jar;%AXIS\_LIB%\log4j-1.2.8.jar;%AXIS\_LIB%\wsdl4j-1.5.1.jar;%GRAYDON\_LIB%\graydonCompanyDataWebservices\_Examples.jar|

**3.** Go to a command line and run one of the examples _(Note: you may need to set the http.proxyHost and http.proxyPort system properties)_

_examples_
|**java** uk.co.graydon.GraydonDataService.examples.CompanyMatchByName "

&lt;userId&gt;

" "

&lt;password&gt;

" "United Kingdom" "IBM"|
|:---------------------------------------------------------------------------------------------------------------------------------------|
|**java** uk.co.graydon.GraydonDataService.examples.CompanyMatchByIdentifier "

&lt;userId&gt;

" "

&lt;password&gt;

" "United Kingdom" "01777777"|
|**java** uk.co.graydon.GraydonDataService.examples.CompanyMatchByKeyword "

&lt;userId&gt;

" "

&lt;password&gt;

" "United Kingdom" "IBM" "London"|
|**java** uk.co.graydon.GraydonDataService.examples.CompanyMatchByPostCode "

&lt;userId&gt;

" "

&lt;password&gt;

" "United Kingdom" "W5 1DB"|