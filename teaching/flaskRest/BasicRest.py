#!`pwd`/flask/bin/python

# This is a very basic Restful to get

from flask import Flask,request, Response
import sys
import os

app = Flask(__name__)

# Setting the initial value 
counter=0

if len(sys.argv) > 1:
    counter=int(sys.argv[1])
print("INITIAL COUNTER = "+str(counter))

# Using Python decortors for POST
@app.route('/res',methods=['POST'])
def indexPost():
    global counter
    value=request.form.get('value')
    counter=int(value)
    print("Setting to new value "+str(value))
    return Response('Value changed OK', status=200)


# Using Python decorator for GET
@app.route('/res',methods=['GET'])
def index():
    global counter
    return str(counter)

# Using Python decorator for PUT and DELETE
# TODO: Enhance this by using multithreading instead of lock files
@app.route('/res',methods=['PUT','DELETE'])
def indeiwx():
    global counter
    while True:
        if not os.path.isfile('/tmp/lock'):
            os.system('touch /tmp/lock')
        if request.method == 'PUT':
            counter=counter+1
        elif request.method == 'DELETE':
            counter=counter-1
        else:
            counter=counter
        saveToFile(counter)
        os.system('rm /tmp/lock')
        break
    return str(counter)

#  Data persistency.
#  TODO: Enhance this by using a Database
def saveToFile(counter):
    with open('/tmp/lock','w') as fh:
        fh.write(str(counter))

if __name__ == '__main__':
    # Externally visible
    app.run(debug=True,host='0.0.0.0',threaded=True)
