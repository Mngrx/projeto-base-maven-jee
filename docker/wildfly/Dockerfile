# IMD0409 - Web2
# kaduardo@imd.ufrn.br
# Based on https://github.com/jboss-dockerfiles/wildfly

FROM jboss/wildfly

RUN /opt/jboss/wildfly/bin/add-user.sh admin Admin --silent

EXPOSE 8080 9990

CMD ["/opt/jboss/wildfly/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]

# Then you can build the image:
#   docker build --tag=jboss/wildfly-admin .
# Run it:
#   docker run -p 8080:8080 -p 9990:9990 -it jboss/wildfly-admin
# Administration console will be available on the port 9990 of the container.
