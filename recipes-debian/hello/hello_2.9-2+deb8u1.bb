inherit debian-dsc
inherit sbuild

# TODO: automatically get URI through the apt repository DB?
# or, is debian-dsc.class is intended to be merged into OE-Core?
DSC_URI = "${DEBIAN_REPO}/pool/main/h/${PN}/${PN}_${PV}.dsc;md5sum=faa827e0ff1d7e76c12488ed77e8fc76"
