# circle-ci-poc

## Purpose
This project is an example of a project with a CI and release process managed by [circleci](https://circleci.com/pricing/#build-linux)

## Lifecycle
1. Any update to any branch triggers a build & test workflow on that branch. 
2. Git branch protection is enabled on master will not allow merges that haven't passed the build. 
3. A new Git release/tag that starts with 'v' (eg, 'v0.0.1-alpha') will trigger a release to an externally hosted artifactory instance. 
