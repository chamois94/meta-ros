# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Driver for rc_visard and rc_cube from Roboception GmbH"
AUTHOR = "Felix Ruess <felix.ruess@roboception.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rc_genicam_driver"
ROS_BPN = "rc_genicam_driver"

ROS_BUILD_DEPENDS = " \
    diagnostic-updater \
    image-transport \
    rc-common-msgs \
    rc-genicam-api \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    stereo-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    diagnostic-updater \
    image-transport \
    rc-common-msgs \
    rc-genicam-api \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    stereo-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    diagnostic-updater \
    image-transport \
    rc-common-msgs \
    rc-genicam-api \
    rclcpp \
    rclcpp-components \
    sensor-msgs \
    stereo-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-cppcheck \
    ament-cmake-xmllint \
    ament-lint-auto \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rc_genicam_driver_ros2-release/archive/release/humble/rc_genicam_driver/0.2.1-3.tar.gz
ROS_BRANCH ?= "branch=release/humble/rc_genicam_driver"
SRC_URI = "git://github.com/ros2-gbp/rc_genicam_driver_ros2-release;${ROS_BRANCH};protocol=https"
SRCREV = "51e42a27058c12d1edad83ec66d15fd31d3e2261"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
