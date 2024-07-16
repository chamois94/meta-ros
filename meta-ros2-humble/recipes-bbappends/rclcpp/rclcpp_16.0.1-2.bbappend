ROS_BUILD_DEPENDS += " \
    python3-empy-native \
    rcutils-native \
"

FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"
SRC_URI += " \
    file://0001-No-virtual-dtor-warning.patch \
    file://0002-Add-missing-stdexcept-include.patch \
"
