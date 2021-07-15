#!/bin/bash
git fetch origin
b64diff=$(git diff origin/master | base64 -e | tr -d '\n\r')
curl -X "POST" "https://circleci.com/api/v2/project/gh/pashields/circletests/pipeline" \
     -H "Circle-Token: ${CIRCLE_TOKEN}" \
     -H 'Content-Type: application/json; charset=utf-8' \
     -d $'{
  "parameters": {
    "b64diff": "'$b64diff'"
  },
  "branch": "master"
}'
