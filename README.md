# Context 

This is a fork of the probably discontinued [Atlassian IDE Connector for Eclipse](https://bitbucket.org/atlassian/connector-eclipse) which work on Eclipse 4.8. It has been tested with MacOS and Linux and as Java code it should work everywhere.

# Target JIRA platforms

The connector has been lightly tested with JIRA 6.3.1 on-premise and Atlassian Cloud.

# Installation

In an Eclipse Photon distribution with [Mylyn](http://www.eclipse.org/mylyn/) installed or included (like JEE), install the archive provided in the [current release](https://github.com/rastaman/mylyn-jira-connector/releases/tag/3.2.5.201808261123) :

- [eclipse-connector-3.2.5.201808261123.zip](https://github.com/rastaman/mylyn-jira-connector/releases/download/3.2.5.201808261123/eclipse-connector-3.2.5.201808261123.zip)

# Usage

Create a task repository from Mylyn dedicated view "Tasks repositories".

If you want to use Atlassian Cloud, create and use an API token as the password in the configuration of the task repository : [API tokens](https://confluence.atlassian.com/cloud/api-tokens-938839638.html)

# Build from source

The release should work but the source is probably not ready to use, one have to add to the target Eclipse Platform the [Mylyn bundles](http://mirror.switch.ch/eclipse/mylyn/drops/3.24.1/v20180619-2220/mylyn-3.24.1.v20180619-2220.zip) and the [bundles folder](https://github.com/rastaman/mylyn-jira-connector/tree/master/bundles) in order to export the JIRA connector feature from Eclipse.

# Roadmap

- Remove all the unpackaged plugins of the connector, keep only JIRA related ones,
- Make the headless build great again!
