# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_humble
inherit ros_superflore_generated

DESCRIPTION = "Clients for interfacing with Roboception reason modules on rc_visard and rc_cube."
AUTHOR = "ruess <felix.ruess@roboception.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rc_reason_clients"
ROS_BPN = "rc_reason_clients"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    python3-requests \
    rc-reason-msgs \
    rclpy \
    ros2pkg \
    tf2-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    python3-requests \
    rc-reason-msgs \
    rclpy \
    ros2pkg \
    tf2-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    python3-requests \
    rc-reason-msgs \
    rclpy \
    ros2pkg \
    tf2-msgs \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-copyright \
    ament-flake8 \
    ament-pep257 \
    python3-pytest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rc_reason_clients-release/archive/release/humble/rc_reason_clients/0.2.1-4.tar.gz
ROS_BRANCH ?= "branch=release/humble/rc_reason_clients"
SRC_URI = "git://github.com/ros2-gbp/rc_reason_clients-release;${ROS_BRANCH};protocol=https"
SRCREV = "2121d3102a01ca86fbdf2282055ea9bf3e7792b1"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}
