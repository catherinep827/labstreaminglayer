/****************************************************************************
**
** Copyright (C) 2015 The Qt Company Ltd.
** Contact: http://www.qt.io/licensing/
**
** This file is part of the examples of the Qt Toolkit.
**
** $QT_BEGIN_LICENSE:BSD$
** You may use this file under the terms of the BSD license as follows:
**
** "Redistribution and use in source and binary forms, with or without
** modification, are permitted provided that the following conditions are
** met:
**   * Redistributions of source code must retain the above copyright
**     notice, this list of conditions and the following disclaimer.
**   * Redistributions in binary form must reproduce the above copyright
**     notice, this list of conditions and the following disclaimer in
**     the documentation and/or other materials provided with the
**     distribution.
**   * Neither the name of The Qt Company Ltd nor the names of its
**     contributors may be used to endorse or promote products derived
**     from this software without specific prior written permission.
**
**
** THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
** "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
** LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
** A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
** OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
** SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
** LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
** DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
** THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
** (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
** OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE."
**
** $QT_END_LICENSE$
**
****************************************************************************/

/***************************************************************************
** This code is from Qt and its license is above. It has been extended
** to be compatible with the Microsoft Media Foundation framework for
** recording video files.
**
** This modification was done by David Medine at the Swartz Center for
** Computational Neuroscience at UCSD.
****************************************************************************/

#ifndef VIDEOSETTINGS_H
#define VIDEOSETTINGS_H
#ifdef _WIN32
#include "wincapture.h"
#endif

#include <QDialog>
#include <QAudioEncoderSettings>
#include <QVideoEncoderSettings>



QT_BEGIN_NAMESPACE
class QComboBox;
class QMediaRecorder;
//class WinCapture;
namespace Ui { class VideoSettingsUi; }
QT_END_NAMESPACE

class VideoSettings : public QDialog
{
    Q_OBJECT

public:
	// only for windows

	VideoSettings(WinCapture *winCapture, QWidget *parent = 0);
	// for normal OS

    VideoSettings(QMediaRecorder *mediaRecorder, QWidget *parent = 0);

    ~VideoSettings();

	// for windows
	int getWinFormatIdx(void) const;
	void setWinFormat(const int idx);

    QAudioEncoderSettings audioSettings() const;
    void setAudioSettings(const QAudioEncoderSettings&);

    QVideoEncoderSettings videoSettings() const;
    void setVideoSettings(const QVideoEncoderSettings&);

    QString format() const;
    void setFormat(const QString &format);

protected:
    void changeEvent(QEvent *e);

private:
    QVariant boxValue(const QComboBox*) const;
    void selectComboBoxItem(QComboBox *box, const QVariant &value);
	QList<QString> supportedFormats(std::vector<winCameraInfo> &infoVec);

    Ui::VideoSettingsUi *ui;
    QMediaRecorder *mediaRecorder;
	WinCapture *winCapture;
};

#endif // VIDEOSETTINGS_H
