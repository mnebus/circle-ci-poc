# circle-ci-poc

## Build Status
[![CircleCI](https://circleci.com/gh/mnebus/circle-ci-poc.svg?style=svg)](https://circleci.com/gh/mnebus/circle-ci-poc)
[![DepShield Badge](https://depshield.sonatype.org/badges/mnebus/circle-ci-poc/depshield.svg)](https://depshield.github.io)

## Purpose
This project is an example of a project with a CI and release process managed by [circleci](https://circleci.com/pricing/#build-linux)

## Lifecycle
1. Any update to any branch triggers a build & test workflow on that branch. 
2. Git branch protection is enabled on master will not allow merges that haven't passed the build. 
3. A new Git release/tag that starts with 'v' (eg, 'v0.0.1-alpha') will trigger a release to an externally hosted artifactory instance. 

[Build config](.circleci/config.yml) 

