export const formatTime = (timestamp: string): string => {
    const date = new Date(timestamp);

    if (isNaN(date.getTime())) {
        return 'Invalid date';
    }
    return date.toLocaleTimeString('nl-NL', {
        hour: 'numeric',
        minute: 'numeric',
        hour12: false,
    });
};

export const formatDate = (timestamp:string) =>{
    const date = new Date(timestamp);
    if (isNaN(date.getTime())) {
        return 'Invalid date';
    }
    return date.toLocaleDateString('nl-NL', {
        year: '2-digit',
        month: '2-digit',
        day: '2-digit',
        hour:'numeric',
        minute:'2-digit',
        hour12: false,
    });
}
export const formatDateOnly = (timestamp: string) => {
    const date = new Date(timestamp);
    if (isNaN(date.getTime())) {
        return 'Invalid date';
    }
    return date.toLocaleDateString('nl-NL', {
        year: '2-digit',
        month: '2-digit',
        day: '2-digit',
    });
}